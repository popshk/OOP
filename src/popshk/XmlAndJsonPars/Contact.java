package popshk.XmlAndJsonPars;

import java.util.List;

public class Contact {
    private String name;
    private String surname;
    private List<String> phones;
    private List<String> sites;
    private Address address;


    @Override
    public String toString() {
        StringBuilder phoneList = new StringBuilder();
        phoneList.append("Phone number:");
            int counter = 1;
        for (String phone : phones) {
            phoneList.append("\n\t\t" + counter + ") " + phone);
             counter++;
        }

        StringBuilder webList = new StringBuilder();
        webList.append("Wed sites:");
        for (String site : sites) {
            webList.append("\n\t\t" + site);
        }
        return "@" + name + " " + surname +
                "\n\t" + phoneList +
                "\n\t" + webList +
                "\n\tAddress:" +
                "\n\t" + address;
    }

    class Address{
        private String country;
        private String city;
        private String street;

        @Override
        public String toString() {
            return street + ", " + city + ", " + country + ".";
        }
    }


}

