package jogja.telkom.csrassistant.Adapter

import java.io.Serializable
import java.util.ArrayList

class Instruksi : Serializable {
    var instruksi: String? = null
    var childDataItems: ArrayList<ChildInstruksi>? = null
        private set

    fun setChildInstruksis(childInstruksis: ArrayList<ChildInstruksi>) {
        this.childDataItems = childInstruksis
    }
}
