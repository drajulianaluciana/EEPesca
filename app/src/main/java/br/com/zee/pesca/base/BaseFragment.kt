package br.com.zee.pinbike.ui.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.google.android.material.textfield.TextInputLayout

abstract class BaseFragment<viewBinding : ViewBinding> : Fragment() {

    private var _binding: viewBinding? = null
    private var activityCallBack: ActivityCallback? = null
    protected val binding get() = _binding!!


    override fun onResume() {
        super.onResume()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initializeUi()
        setHasOptionsMenu(showActionBarOptionMenu())
    }

    protected open fun showActionBarOptionMenu(): Boolean = false

    protected abstract fun getViewBinding(): viewBinding

    protected abstract fun initializeUi()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = getViewBinding()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return _binding?.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            activityCallBack = context as ActivityCallback
        } catch (classCastException: ClassCastException) {

           // Toast.makeText(context, classCastException.message.toString(), Toast.LENGTH_SHORT).show()

        }
    }

    override fun onDetach() {
        super.onDetach()
        activityCallBack = null
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


    protected fun setOnBackPressedCallback(backPressAction: () -> Unit = {}) {
        val callback: OnBackPressedCallback =
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    backPressAction()
                }
            }
        requireActivity().onBackPressedDispatcher.addCallback(this, callback)
    }


    fun startLoading() = activityCallBack?.showLoadingSpinner()
    fun stopLoading() = activityCallBack?.hideLoadingSpinner()



    fun showAppBarTitle() = activityCallBack?.showAppBarBackButton(true)
    fun hideAppBarTitle() = activityCallBack?.showAppBarBackButton(false)
    fun showActionBar() = activityCallBack?.showActionBar(true)
    fun hideActionBar() = activityCallBack?.showActionBar(false)




}