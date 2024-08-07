package com.example.healthicore.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.healthicore.databinding.FragmentRegistrationBinding

class RegistrationFragment : Fragment() {

    private lateinit var binding: FragmentRegistrationBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentRegistrationBinding.inflate(inflater, container, false)

        return binding.root
    }

}