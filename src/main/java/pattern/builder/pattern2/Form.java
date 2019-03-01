package pattern.builder.pattern2;

import java.util.Date;

/**
 * Created by Jack on Feb 10:19 PM, 2019
 *
 * Use the Builder pattern when
 * • The algorithm for creating a complex object should be independent of the parts that make up the object
 * and how they're assembled.
 * • The construction process must allow different representation for the object's constructed.
 **/
public class Form {

    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String address;
    private Date dob;
    private String email;
    private String backupEmail;
    private String spouseName;
    private String city;
    private String state;
    private String country;
    private String language;
    private String passwordHint;
    private String securityQuestion;
    private String securityAnswer;

    public static class FormBuilder{
        private String firstName;
        private String lastName;
        private String userName;
        private String password;
        private String address;
        private Date dob;
        private String email;
        private String backupEmail;
        private String spouseName;
        private String city;
        private String state;
        private String country;
        private String language;
        private String passwordHint;
        private String securityQuestion;
        private String securityAnswer;

        public FormBuilder(String firstName,String lastName,
                           String userName, String password){
            this.firstName = firstName;
            this.userName = userName;
            this.lastName = lastName;
            this.password = password;
        }

        public FormBuilder address(String address){
            this.address = address;
            return this;
        }

        public FormBuilder dob(Date dob){
            this.dob = dob;
            return this;
        }

        public FormBuilder email(String email){
            this.email = email;
            return this;
        }

        public FormBuilder backupEmail(String backupEmail){
            this.backupEmail = backupEmail;
            return this;
        }

        public FormBuilder spouseName(String spouseName){
            this.spouseName = spouseName;
            return this;
        }

        public FormBuilder city(String city){
            this.city = city;
            return this;
        }

        public FormBuilder state(String state){
            this.state = state;
            return this;
        }

        public FormBuilder country(String country){
            this.country = country;
            return this;
        }

        public FormBuilder language(String language){
            this.language = language;
            return this;
        }

        public FormBuilder passwordHint(String passwordHint){
            this.passwordHint = passwordHint;
            return this;
        }

        public FormBuilder securityQuestion(String securityQuestion){
            this.securityQuestion = securityQuestion;
            return this;
        }

        public FormBuilder securityAnswer(String securityAnswer){
            this.securityAnswer = securityAnswer;
            return this;
        }

        public Form build(){
            return new Form(this);
        }

    }


    private Form (FormBuilder formBuilder){
        this.firstName = formBuilder.firstName;
        this.lastName = formBuilder.lastName;
        this.userName = formBuilder.userName;
        this.password = formBuilder.password;
        this.address = formBuilder.address;
        this.dob = formBuilder.dob;
        this.email = formBuilder.email;
        this.backupEmail = formBuilder.backupEmail;
        this.spouseName = formBuilder.spouseName;
        this.city = formBuilder.city;
        this.state = formBuilder.state;
        this.country = formBuilder.country;
        this.language = formBuilder.language;
        this.passwordHint = formBuilder.passwordHint;
        this.securityQuestion = formBuilder.securityQuestion;
        this.securityAnswer = formBuilder.securityAnswer;

    }


    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(" First Name:");
        sb.append(firstName);
        sb.append("\n\n Last Name:");
        sb.append(lastName);
        sb.append("\n\n User Name:");
        sb.append(userName);
        sb.append("\n\n Password:");
        sb.append(password);

        if(this.address != null){
            sb.append("\n\n Address: ");
            sb.append(address);
        }

        if(this.dob != null){
            sb.append("\n\n DOB: ");
            sb.append(dob);
        }

        if(this.email != null){
            sb.append("\n\n Email: ");
            sb.append(email);
        }

        if(this.backupEmail != null){
            sb.append("\n\n Backup Email:");
            sb.append(backupEmail);
        }

        if(this.spouseName != null){
            sb.append("\n\n Spouse Name:");
            sb.append(spouseName);
        }

        if(this.city != null){
            sb.append("\n\n City: ");
            sb.append(city);
        }

        if(this.state != null){
            sb.append("\n\n State: ");
            sb.append(state);
        }

        if(this.country != null){
            sb.append("\n\n Country: ");
            sb.append(country);
        }

        if(this.language != null){
            sb.append("\n\n Language: ");
            sb.append(language);
        }

        if(this.passwordHint != null){
            sb.append("\n\n Password Hint: ");
            sb.append(passwordHint);
        }

        if(this.securityQuestion != null){
            sb.append("\n\n Security Question: ");
            sb.append(securityQuestion);
        }

        if(this.securityAnswer != null){
            sb.append("\n\n Security Answer: ");
            sb.append(securityAnswer);
        }
        return sb.toString();
    }


    public static void main(String [] args){
        Form form = new FormBuilder("Dave" , "Carter" , "DavCarter","DavEr123")
                .passwordHint("MyName")
                .city("NY")
                .language("English")
                .build();
        System.out.println(form);

    }

}
