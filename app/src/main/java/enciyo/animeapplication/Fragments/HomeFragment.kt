package enciyo.animeapplication.Fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import enciyo.animeapplication.R
import enciyo.animeapplication.Adapters.ViewPager
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    var mViewPager: ViewPager? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        return view!!
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mViewPager= ViewPager(childFragmentManager)
        mViewPager!!.addFragment(TrendFragment(),"Trend")
        mViewPager!!.addFragment(MagazineFragment(),"Magazine")
        viewPager.adapter = mViewPager
        tabLayout.setupWithViewPager(viewPager)


    }
}
