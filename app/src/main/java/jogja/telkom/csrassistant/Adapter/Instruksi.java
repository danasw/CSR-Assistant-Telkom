package jogja.telkom.csrassistant.Adapter;

import java.io.Serializable;
import java.util.ArrayList;

public class Instruksi  implements Serializable {
        private String instruksi;
        private ArrayList<ChildInstruksi> childInstruksis;

        public String getInstruksi() {
            return instruksi;
        }

        public void setInstruksi(String instruksi) {
            this.instruksi = instruksi;
        }

        public ArrayList<ChildInstruksi> getChildDataItems() {
            return childInstruksis;
        }

        public void setChildInstruksis(ArrayList<ChildInstruksi> childInstruksis) {
            this.childInstruksis = childInstruksis;
        }
    }
