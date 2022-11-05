package com.example.navigationproject.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationproject.R
import com.example.navigationproject.databinding.FragmentMainBinding
import androidx.navigation.Navigation
import androidx.lifecycle.ViewModelProvider
import com.example.navigationproject.secondFragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER



/**
 * A simple [Fragment] subclass.
 * Use the [mainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

class mainFragment : Fragment() {
    companion object {
        fun newInstance() = mainFragment()
    }

    private var _binding2 :secondFragment? = null
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    private val binding2 get() = _binding2


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {

        super.onActivityCreated(savedInstanceState)

        binding.button1.setOnClickListener {
            //val action:  mainFragmentDirections.ActionMainFragmentToSecondFragment = mainFragmentDirections.actionMainFragmentToSecondFragment()
            //action.setMessage(binding2.textView2 = "image 1")
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_secondFragment)

        }
        binding.button2.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_secondFragment)

        }
        binding.button3.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_secondFragment)


        }


    }
}
