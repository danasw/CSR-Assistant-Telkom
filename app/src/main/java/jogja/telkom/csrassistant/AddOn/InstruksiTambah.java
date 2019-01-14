package jogja.telkom.csrassistant.AddOn;

public class InstruksiTambah {
    private String instruksi, content;
    private boolean expanded;

    public InstruksiTambah (String instruksi,String content) {
        this.instruksi = instruksi;
        this.content = content;
    }

    public String getInstruksi() {
        return instruksi;
    }

    public void setInstruksi(String instruksi) {
        this.instruksi = instruksi;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }
}
