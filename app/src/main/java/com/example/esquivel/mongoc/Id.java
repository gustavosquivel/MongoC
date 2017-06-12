package com.example.esquivel.mongoc;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Esquivel on 9/06/2017.
 */

 public class Id
{
        @SerializedName("$oid")
        private String oid;

        public String getOid() {
            return oid;
        }

        public void setOid(String oid) {
            this.oid = oid;
        }


}


