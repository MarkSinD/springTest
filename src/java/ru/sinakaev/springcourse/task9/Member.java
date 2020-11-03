package ru.sinakaev.springcourse.task9;

import java.util.LinkedHashMap;

public class Member {

    private String mFirstName;
    private String mSecondName;
    private String mDateOfBirth;
    private String mPassword;
    String[] mProgrammingLanguages;
    LinkedHashMap<String, String> counties;

    Member(){
        counties.put("Abkhazia", "AB");
        counties.put("Austria", "AT");
        counties.put("Bahamas", "BS");
        counties.put("Belize", "BZ");
        counties.put("Bulgaria", "BG");
        counties.put("Brazil", "BR");
        counties.put("Vietnam", "VN");
        counties.put("Guinea", "GN");
        counties.put("Greece", "GR");
        counties.put("India", "IN");
        counties.put("Qatar", "QA");
        counties.put("Lithuania", "LT");
        counties.put("Monaco", "MC");
    }

    public String getmFirstName() {
        return mFirstName;
    }

    public void setmFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public String getmSecondName() {
        return mSecondName;
    }

    public void setmSecondName(String mSecondName) {
        this.mSecondName = mSecondName;
    }

    public String getmDateOfBirth() {
        return mDateOfBirth;
    }

    public void setmDateOfBirth(String mDateOfBirth) {
        this.mDateOfBirth = mDateOfBirth;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }

    public String[] getmProgrammingLanguages() {
        return mProgrammingLanguages;
    }

    public void setmProgrammingLanguages(String[] mProgrammingLanguages) {
        this.mProgrammingLanguages = mProgrammingLanguages;
    }

    public LinkedHashMap<String, String> getCounties() {
        return counties;
    }

    public void setCounties(LinkedHashMap<String, String> counties) {
        this.counties = counties;
    }
}
