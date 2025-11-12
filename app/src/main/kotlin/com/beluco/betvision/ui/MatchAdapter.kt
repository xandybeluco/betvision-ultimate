package com.beluco.betvision.ui
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.beluco.betvision.R
import com.beluco.betvision.data.Match

class MatchAdapter(private val items: List<Match>) : RecyclerView.Adapter<MatchAdapter.VH>() {
    class VH(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.match_title)
        val time: TextView = view.findViewById(R.id.match_time)
        val odds: TextView = view.findViewById(R.id.match_odds)
        val tip: TextView = view.findViewById(R.id.match_tip)
        val betBtn: Button = view.findViewById(R.id.btn_bet)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH { val v = LayoutInflater.from(parent.context).inflate(R.layout.item_match, parent, false); return VH(v) }
    override fun onBindViewHolder(holder: VH, position: Int) { val m = items[position]; holder.title.text = m.title; holder.time.text = m.time; holder.odds.text = "Odds: ${m.oddA} / ${m.oddB}"; holder.tip.text = "Sugestão: " + if(m.oddA < m.oddB) "Team A" else "Team B"; holder.betBtn.setOnClickListener { val ctx = holder.itemView.context; android.widget.Toast.makeText(ctx, ctx.getString(R.string.bet_placed), android.widget.Toast.LENGTH_SHORT).show() } }
    override fun getItemCount(): Int = items.size
}