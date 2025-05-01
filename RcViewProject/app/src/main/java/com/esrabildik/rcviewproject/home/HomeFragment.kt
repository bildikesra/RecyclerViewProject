package com.esrabildik.rcviewproject.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.esrabildik.rcviewproject.R
import com.esrabildik.rcviewproject.adapter.CardAdapter
import com.esrabildik.rcviewproject.databinding.FragmentHomeBinding
import com.esrabildik.rcviewproject.model.Pomodoro


class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding
    private lateinit var adapter : CardAdapter
    private lateinit var pomodoroList : List<Pomodoro>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentHomeBinding.inflate(inflater, container, false)


        pomodoroList = listOf(
            Pomodoro(R.drawable.grup_bir,"Pomodoro 1"),
            Pomodoro(R.drawable.grup_iki,"Pomodoro 2"),
            Pomodoro(R.drawable.grup_uc,"Pomodoro 3"),
            Pomodoro(R.drawable.grup_dort,"Pomodoro 4"),
            Pomodoro(R.drawable.grup_bes,"Pomodoro 5")
        )

        adapter = CardAdapter(pomodoroList)
        binding.rv.layoutManager = LinearLayoutManager(requireContext())
        binding.rv.adapter = adapter

        return binding.root
    }


}