package Builder;


public class Recipient extends ARecipient {

    public static class Builder {
            Recipient recipient;

            public Builder() {
                recipient = new Recipient();
            }

            Builder setUsername(String username){
                recipient.username = username;
                return this;
            }
            Builder setAddress(String address){
                recipient.address = address;
                return this;
            }

            Recipient build(){
                return recipient;
            }


        }

    @Override
    public String toString() {
        return "Recipient{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public void create(String username, String address) {

    }

}
