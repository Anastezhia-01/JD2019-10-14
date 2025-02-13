package by.it.toporova.calculator_jd02_05_and_jd02_06;

import java.util.Locale;
import java.util.ResourceBundle;

@SuppressWarnings("FieldCanBeLocal")
public enum ResMan {

    INSTANCE;

    private final String RESOURSE = "by.it.toporova.calculator_jd02_05_and_jd02_06.lang.messages";
    private Locale locale;
    private ResourceBundle resourceBundle;

    ResMan(){
        setLocale(Locale.getDefault());
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
        resourceBundle=ResourceBundle.getBundle(RESOURSE,locale);
    }

    public void setLocale(String language) {
        setLocale(new Locale(language));
    }

    public void setLocale(String language, String country) {
        setLocale(new Locale(language,country));
    }

    public String get(String key){
        return resourceBundle.getString(key);
    }

}