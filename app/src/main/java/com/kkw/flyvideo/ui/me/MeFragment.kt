package com.kkw.flyvideo.ui.me

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.kkw.flyvideo.databinding.FragmentMeBinding

/**
 * Me页面
 */
class MeFragment : Fragment() {

    companion object {
        fun newInstance() = MeFragment()
    }

    private var _binding: FragmentMeBinding? = null

    private val binding get() = _binding!!

    private lateinit var viewModel: MeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[MeViewModel::class.java]
        viewModel.text.observe(viewLifecycleOwner) {
            binding.textMe.text = it
        }
    }

}