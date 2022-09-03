package com.walleyanimalscovers.app.wlayadapter

import android.content.pm.PackageManager
import android.view.View
import com.google.android.material.snackbar.Snackbar
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import java.io.File
import java.io.FileOutputStream
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.os.Environment
import android.view.LayoutInflater
import com.malwaysvehiclescovers.app.MainActivity
import com.malwaysvehiclescovers.app.databinding.MalwayItemBinding
import com.malwaysvehiclescovers.app.malwaysdata.MalwayVehiclesData

import java.io.OutputStream
import java.lang.Exception
import java.util.*

class MalwaysVehiclesAdapter(val pewrwefewf :List<MalwayVehiclesData>, val activity: AppCompatActivity) : RecyclerView.Adapter<MalwaysVehiclesAdapter.ProfItemHolder>() {
    class ProfItemHolder(val binding : MalwayItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun setProfLaItem(oweweq : MalwayVehiclesData, activity : AppCompatActivity) = with(binding){
            Picasso.get().load(oweweq.ldsjdsds).centerCrop().resize(1280,720)
                .into(ncjksdsd,object : Callback {
                    override fun onSuccess() {
                        pasdqwdq.visibility = View.INVISIBLE
                    }

                    override fun onError(e: Exception?) {

                    }

                } )

            psahjwqdwq.setOnClickListener {
                if(ContextCompat.checkSelfPermission(activity,android.Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(activity, arrayOf(android.Manifest.permission.WRITE_EXTERNAL_STORAGE),100)
                } else {
                    val externalStoreState = Environment.getExternalStorageState()
                    if(externalStoreState.equals(Environment.MEDIA_MOUNTED)){
                        try{
                            val shasasdas = Environment.getExternalStorageDirectory().absolutePath
                            val lsasajdw = File(shasasdas,"${UUID.randomUUID()}.jpg")
                            val wqqwee : OutputStream = FileOutputStream(lsasajdw)
                            val psajsdas  = ContextCompat.getDrawable(activity.applicationContext,oweweq.ldsjdsds)
                            val yyysasa = (psajsdas as BitmapDrawable).bitmap
                            yyysasa.compress(Bitmap.CompressFormat.JPEG,100,wqqwee)
                            wqqwee.flush()
                            wqqwee.close()

                            val snackBar = Snackbar.make((activity as MainActivity).findViewById(android.R.id.content),"Image is saving...",Snackbar.LENGTH_LONG)
                            snackBar.show()
                        }catch(e : Exception){
                            val snackBar = Snackbar.make((activity as MainActivity).findViewById(android.R.id.content),"Image is saving...",Snackbar.LENGTH_LONG)
                            snackBar.show()
                        }


                    }
                }

            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfItemHolder {
        val binding = MalwayItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ProfItemHolder(binding)
    }

    override fun onBindViewHolder(holder: ProfItemHolder, position: Int) {
        holder.setProfLaItem(pewrwefewf[position],activity)

    }

    override fun getItemCount() = pewrwefewf.size


}