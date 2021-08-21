package com.makeappssimple.abhimanyu.navigationdemo.android

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.makeappssimple.abhimanyu.navigationdemo.android.databinding.FragmentHomeBinding
import com.makeappssimple.abhimanyu.navigationdemo.android.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {

    private lateinit var binding: FragmentSearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSearchBinding.inflate(inflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.fragmentSearchButton.setOnClickListener {
            val data = "Data from search fragment"
            val action = SearchFragmentDirections.actionSearchFragmentToDataFragment(data)
            findNavController().navigate(action)
        }
    }
}
