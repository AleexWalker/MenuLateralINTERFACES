package com.example.menulateral.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.menulateral.R
import com.example.menulateral.databinding.FragmentHomeBinding
import com.example.menulateral.ui.CardAdapterFotos
import com.example.menulateral.ui.TarjetaFotos

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val recycler: RecyclerView = binding.recyclerView1

        val itemsFotos = ArrayList<TarjetaFotos>()
        itemsFotos.add(TarjetaFotos(R.drawable.paisaje1 , R.string.paisaje1))
        itemsFotos.add(TarjetaFotos(R.drawable.paisaje2 , R.string.paisaje2))
        itemsFotos.add(TarjetaFotos(R.drawable.paisaje3 , R.string.paisaje3))
        itemsFotos.add(TarjetaFotos(R.drawable.paisaje5 , R.string.paisaje5))
        itemsFotos.add(TarjetaFotos(R.drawable.paisaje6 , R.string.paisaje6))

        val adaptador = CardAdapterFotos(itemsFotos)

        recycler.adapter = adaptador
        recycler.layoutManager = GridLayoutManager(context, 2)
        recycler.itemAnimator = DefaultItemAnimator()

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}