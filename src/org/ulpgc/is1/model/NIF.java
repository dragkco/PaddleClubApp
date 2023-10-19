package org.ulpgc.is1.model;

public class NIF {
    public String number;

    public NIF(String number) {
        this.number = number;
         private static final String NIF_REGEX = "^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]$";
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
       public static boolean isValid(String nif) {
        if (nif == null) {
            return false;
        }
        Pattern pattern = Pattern.compile(NIF_REGEX);
        Matcher matcher = pattern.matcher(nif);
        return matcher.matches();
       }

}
