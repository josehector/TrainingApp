package es.josehector.app.kotlin.trainingapp

/**
 * Created by Usuario on 11/04/2017.
 */

fun getItems(): List<Item>{
    return (1..10).map { Item(it.toLong(),"Title $it","http://lorempixel.com/400/400/cats/$it") }
}

data class Item(val id: Long,val title : String, val url : String)