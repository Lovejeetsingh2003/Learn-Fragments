package com.example.fragmentandactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentActivity

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstFragment : Fragment(), Activityinterface {
    // TODO: Rename and change types of parameters
  lateinit var initView : View
    lateinit var btnIncerement : Button
    lateinit var btnClear : Button
    lateinit var mainActivity: MainActivity
    lateinit var fragmentMain : FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivity = activity as MainActivity
        mainActivity.activityinterface =  this
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       initView = inflater.inflate(R.layout.fragment_first, container, false)
        return initView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnIncerement = view.findViewById(R.id.btnIncrement)
        btnClear = view.findViewById(R.id.btnClear)
        fragmentMain = view.findViewById(R.id.fragmentMain)

        btnIncerement.setOnClickListener {
            mainActivity.number = mainActivity.number + 1
            mainActivity.UpdateNumber()
        }
        btnClear.setOnClickListener {
            mainActivity.number = 0
            mainActivity.UpdateNumber()
            fragmentMain.setBackgroundColor(ContextCompat.getColor(mainActivity, R.color.white))
        }

    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FirstFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FirstFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun redcolor() {
        fragmentMain.setBackgroundColor(ContextCompat.getColor(mainActivity, R.color.Red))
    }

    override fun bluecolor() {
        fragmentMain.setBackgroundColor(ContextCompat.getColor(mainActivity, R.color.Blue))
    }

    override fun greencolor() {
        fragmentMain.setBackgroundColor(ContextCompat.getColor(mainActivity, R.color.Green))
    }
}