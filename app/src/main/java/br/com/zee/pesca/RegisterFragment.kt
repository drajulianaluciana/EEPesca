package br.com.zee.pesca;

import androidx.navigation.fragment.findNavController
import br.com.zee.pesca.databinding.FragmentProfileBinding
import br.com.zee.pesca.databinding.FragmentRegisterBinding
import br.com.zee.pinbike.ui.base.BaseFragment

class RegisterFragment : BaseFragment<FragmentRegisterBinding>() {
    override fun getViewBinding(): FragmentRegisterBinding =
        FragmentRegisterBinding.inflate(layoutInflater)

    override fun initializeUi() {
        binding.btnConcluirRegister.setOnClickListener{
            findNavController().navigate(R.id.action_registerFragment_to_navigationActivity)
        }
    }
}
