package br.com.zee.pesca;

import androidx.navigation.fragment.findNavController
import br.com.zee.pesca.databinding.FragmentAuthenticationBinding
import br.com.zee.pinbike.ui.base.BaseFragment

class AuthenticationFragment : BaseFragment<FragmentAuthenticationBinding>() {
        override fun getViewBinding(): FragmentAuthenticationBinding =
                FragmentAuthenticationBinding.inflate(layoutInflater)

        override fun initializeUi() {
               binding.btnCriar.setOnClickListener {
                   findNavController().navigate(R.id.action_authenticationFragment_to_registerFragment)
               }
        }
}
