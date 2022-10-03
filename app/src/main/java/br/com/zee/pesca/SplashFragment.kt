package br.com.zee.pesca;

import android.os.Handler
import android.os.Looper
import androidx.navigation.fragment.findNavController
import br.com.zee.pesca.databinding.FragmentSplashBinding
import br.com.zee.pinbike.ui.base.BaseFragment

class SplashFragment : BaseFragment<FragmentSplashBinding>() {
    override fun getViewBinding(): FragmentSplashBinding =
        FragmentSplashBinding.inflate(layoutInflater)

    override fun initializeUi() {
        Handler(Looper.getMainLooper()).postDelayed(this::initclicks, 2000)
    }

    private fun initclicks() {
        findNavController().navigate(R.id.action_splashFragment_to_connectionFragment)

    }
}

