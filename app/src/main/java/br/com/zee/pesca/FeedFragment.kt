package br.com.zee.pesca;


import br.com.zee.pesca.databinding.FragmentFeedBinding
import br.com.zee.pinbike.ui.base.BaseFragment

class FeedFragment : BaseFragment<FragmentFeedBinding>() {
    override fun getViewBinding(): FragmentFeedBinding =
        FragmentFeedBinding.inflate(layoutInflater)

    override fun initializeUi() {
//        TODO("Not yet implemented")
    }
}
