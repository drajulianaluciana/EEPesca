package br.com.zee.pesca;

import android.content.Intent
import androidx.navigation.fragment.findNavController
import br.com.zee.pesca.databinding.FragmentLoginBinding
import br.com.zee.pinbike.ui.base.BaseFragment

class LoginFragment : BaseFragment<FragmentLoginBinding>() {
    override fun getViewBinding(): FragmentLoginBinding =
        FragmentLoginBinding.inflate(layoutInflater)

    override fun initializeUi() {

        binding.btnForgetPassword.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_authenticationFragment)
        }
        binding.btnRegister.setOnClickListener{
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }
        binding.btnConcluirLogin.setOnClickListener() {
            val intent = Intent(context, NavigationActivity::class.java)
            startActivity(intent)
        }
    }
}
