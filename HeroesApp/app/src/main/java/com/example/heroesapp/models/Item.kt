package com.example.heroesapp.models

import com.example.heroesapp.R

data class Item(val id:Int, val name: String, val image: String){
    companion object{
        val items = mutableListOf<Item>(
            Item(1, "DC",
                "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/3cd770b2-3e49-4672-99fb-8483b9dd9bf0/dgejzyc-806c0265-5dbb-4c86-a075-aef7644568a4.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzNjZDc3MGIyLTNlNDktNDY3Mi05OWZiLTg0ODNiOWRkOWJmMFwvZGdlanp5Yy04MDZjMDI2NS01ZGJiLTRjODYtYTA3NS1hZWY3NjQ0NTY4YTQucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.cTNxHNBh92xk7sKO-NX9txplUwMHgmLte6laURCPnQI" ),
            Item(2, "Marvel", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/Marvel_Logo.svg/1280px-Marvel_Logo.svg.png")
        )
    }
}
