package br.com.zee.pesca;


import androidx.navigation.fragment.findNavController
import br.com.zee.pesca.databinding.FragmentConnectionBinding
import br.com.zee.pinbike.ui.base.BaseFragment

class ConnectionFragment : BaseFragment<FragmentConnectionBinding>() {
    override fun getViewBinding(): FragmentConnectionBinding =
        FragmentConnectionBinding.inflate(layoutInflater)

    override fun initializeUi() {
      binding.btnEmail.setOnClickListener{
      findNavController().navigate(R.id.action_connectionFragment_to_loginFragment)
      }
    }
}
