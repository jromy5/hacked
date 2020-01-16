package li.doerf.hacked.ui.fragments


import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections

/**
 * A simple [Fragment] subclass.
 * Use the [AccountsListFullFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AccountsListFullFragment : AccountsFragmentBase() {

    override fun createNavDirections(accountId: Long): NavDirections {
        val action = AccountsListFullFragmentDirections.actionAccountsListFullFragmentToAccountDetailsFragment(accountId)
        action.accountId = accountId
        return action
    }


}
