package es.josehector.app.kotlin.trainingapp

/**
 * Created by Usuario on 11/04/2017.
 */
class Item {
    var title : String = ""
        get() {
            return "Title: $field"
        }
        set(value) {
            field = "Title: $value"
        }
    var url : String = ""




}