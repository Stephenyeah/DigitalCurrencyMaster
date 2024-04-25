package haagahelia.zhenyu.DigitalCurrencyMaster.service;


import haagahelia.zhenyu.DigitalCurrencyMaster.model.User;
import haagahelia.zhenyu.DigitalCurrencyMaster.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



@Service
public class UserDetailServiceImpl implements  UserDetailsService {

    private final UserRepository repository;


    @Autowired
    public UserDetailServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User curruser = repository.findByUsername(username);

        org.springframework.security.core.userdetails.User.UserBuilder builder = null;
        if (curruser == null) {
            throw new UsernameNotFoundException("User not found.");
        } else {
            builder = org.springframework.security.core.userdetails.User.withUsername(username);
            builder.password(curruser.getPasswordHash());
            builder.roles(curruser.getRole());
        }

        return builder.build();

    }




}
