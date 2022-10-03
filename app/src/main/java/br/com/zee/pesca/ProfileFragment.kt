package br.com.zee.pesca;

import android.content.Intent
import br.com.zee.pesca.databinding.FragmentProfileBinding
import br.com.zee.pinbike.ui.base.BaseFragment

class ProfileFragment : BaseFragment<FragmentProfileBinding>() {
    override fun getViewBinding(): FragmentProfileBinding =
        FragmentProfileBinding.inflate(layoutInflater)

    override fun initializeUi() {
        binding.btnSettings.setOnClickListener {
            val intent = Intent(context, NotificationActivity::class.java)
            startActivity(intent)
        }
    }
}
