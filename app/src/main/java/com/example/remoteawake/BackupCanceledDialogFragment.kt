package com.example.remoteawake

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.fragment.app.DialogFragment
import com.google.android.material.button.MaterialButton

class BackupCanceledDialogFragment : DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.dialog_backup_canceled, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<MaterialButton>(R.id.btnAceptar).setOnClickListener {
            dismiss()
            startActivity(Intent(requireContext(), HomeActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
            })
            requireActivity().finish()
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        return dialog
    }

    override fun onStart() {
        super.onStart()
        dialog?.window?.let { window ->
            val params = window.attributes
            params.width = (resources.displayMetrics.widthPixels * 0.72).toInt()
            window.attributes = params
        }
    }
}
