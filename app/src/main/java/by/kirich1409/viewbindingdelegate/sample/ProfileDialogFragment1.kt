@file:Suppress("unused")

package by.kirich1409.viewbindingdelegate.sample

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import by.kirich1409.viewbindingdelegate.dialogViewBinding
import by.kirich1409.viewbindingdelegate.sample.databinding.FragmentProfileBinding

class ProfileDialogFragment1 : DialogFragment() {

    private val viewBindingUsingReflection: FragmentProfileBinding by dialogViewBinding(R.id.container)

    private val viewBindingWithoutReflection by dialogViewBinding(FragmentProfileBinding::bind, R.id.container)

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireContext())
            .setView(R.layout.fragment_profile)
            .create()
    }
}
