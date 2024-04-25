package haagahelia.zhenyu.DigitalCurrencyMaster.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class ResetPasswordForm {

    @NotEmpty
    @Size(min=5, max=30)
    private String email = "";

    @NotEmpty
    @Size(min=5, max=50)
    private String code = "";

    @NotEmpty
    @Size(min=7, max=30)
    private String newpassword = "";

    public ResetPasswordForm() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNewpassword() {
        return newpassword;
    }

    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }
}
