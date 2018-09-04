package com.games.livscorporation.caderno

import android.content.Context
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class NoteAdapter : RecyclerView.Adapter<NoteAdapter.NoteViewHolder> {

    var context: Context
    var notebooks: List<Notebook>

    constructor(c: Context, l: List<Notebook>){
        this.context = c
        this.notebooks = l
    }

    class NoteViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        var noteTitle: TextView
        var cardView: CardView

        init {
            noteTitle = itemView!!.findViewById(R.id.txt_noteName)
            cardView = itemView!!.findViewById(R.id.card_note)
        }
        
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        var view: View = LayoutInflater.from(context).inflate(R.layout.note_item,parent,false)
        return NoteViewHolder(view)
    }

    override fun getItemCount(): Int {
        return notebooks.size
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        var notebook: Notebook = notebooks.get(position)

        holder.noteTitle.text = notebook.title
    }
}