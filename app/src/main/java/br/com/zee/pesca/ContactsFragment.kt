package br.com.zee.pesca;

import android.app.Activity;
import android.content.Intent
import br.com.zee.pesca.databinding.FragmentConnectionBinding
import br.com.zee.pesca.databinding.FragmentContactsBinding
import br.com.zee.pinbike.ui.base.BaseFragment

class ContactsFragment : BaseFragment<FragmentContactsBinding>() {
    override fun getViewBinding(): FragmentContactsBinding =
        FragmentContactsBinding.inflate(layoutInflater)

    override fun initializeUi() {
        binding.fabContacts.setOnClickListener {
            val intent = Intent(context, AddContactActivity::class.java)
            startActivity(intent)
        }
    }
}