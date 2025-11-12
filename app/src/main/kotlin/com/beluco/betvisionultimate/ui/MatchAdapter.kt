package com.beluco.betvisionultimate.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
class MatchAdapter(private val items: List<String>) : RecyclerView.Adapter<MatchAdapter.VH>(){class VH(v:View):RecyclerView.ViewHolder(v){}
override fun onCreateViewHolder(p:ViewGroup,vt:Int)=VH(LayoutInflater.from(p.context).inflate(R.layout.item_match,p,false))
override fun onBindViewHolder(h:VH,pos:Int){}
override fun getItemCount()=items.size }