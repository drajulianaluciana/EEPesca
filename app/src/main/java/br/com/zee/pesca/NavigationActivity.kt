package br.com.zee.pesca;


import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import br.com.zee.pesca.databinding.ActivityNavigationBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class NavigationActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener{

    private lateinit var binding: ActivityNavigationBinding

    private lateinit var feedFragment: FeedFragment
    private lateinit var mapsFragment: MapsFragment2
    private lateinit var contactsFragment: ContactsFragment
    private lateinit var profileFragment: ProfileFragment
    private lateinit var bottomNavigation: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)

        binding = ActivityNavigationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        feedFragment = FeedFragment()
        mapsFragment = MapsFragment2()
        contactsFragment = ContactsFragment()
        profileFragment= ProfileFragment()
        bottomNavigation = findViewById(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener(this)

        setFragment(feedFragment)
    }

    private fun setFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainerNavigation, fragment)
        fragmentTransaction.commit()

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.menu_feed -> {
                setFragment(feedFragment)
            }
            R.id.menu_maps -> {
                setFragment(mapsFragment)
            }
            R.id.menu_contacts -> {
                setFragment(contactsFragment)
            }
            R.id.menu_profile -> {
                setFragment(profileFragment)
            }
        }

        return true
    }

}
