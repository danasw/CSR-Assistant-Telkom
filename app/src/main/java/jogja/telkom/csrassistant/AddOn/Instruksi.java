package jogja.telkom.csrassistant.AddOn;

public class Instruksi {

    private String langkah;
    private String isi;
    private boolean expanded;

    public Instruksi (String langkah, String isi){
        this.langkah  = langkah;
        this.isi        = isi;
    }

    public String getLangkah() {
        return langkah;
    }

    public void setLangkah(String langkah) {
        this.langkah = langkah;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }
}
