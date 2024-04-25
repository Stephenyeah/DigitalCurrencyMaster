package haagahelia.zhenyu.DigitalCurrencyMaster.service;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class UserService {

    private static final String RESET_PASSWORD_CODE_PREFIX = "reset_password:code:";

    private final EmailService emailService;
    private final RedisTemplate<String, String> redisTemplate;

    public UserService(EmailService emailService, RedisTemplate<String, String> redisTemplate) {
        this.emailService = emailService;
        this.redisTemplate = redisTemplate;
    }

    public void sendResetPasswordEmail(String emailAddress) {
        // 1. 生成验证码
        String verificationCode = emailService.generateVerificationCode();

        // 2. 将验证码存储到 Redis
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        ops.set(RESET_PASSWORD_CODE_PREFIX + emailAddress, verificationCode, 10, TimeUnit.MINUTES);

        // 3. 发送邮件
        String emailSubject = "重置密码";
        String emailContent = "您的验证码为: " + verificationCode;
        emailService.sendSimpleEmail(emailAddress, emailSubject, emailContent);
    }

    public boolean validateVerificationCode(String emailAddress, String inputCode) {
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        String storedCode = ops.get(RESET_PASSWORD_CODE_PREFIX + emailAddress);
        return inputCode.equals(storedCode);
    }

    public void resetPassword(String emailAddress, String newPassword) {
        // 在这里实现重置密码的逻辑
    }
}
