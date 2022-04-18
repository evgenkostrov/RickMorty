package com.ko.rickmorty

import android.app.Application



import com.ko.rickmorty.di.Injector
import com.ko.rickmorty.di.cartooncharacter.CartoonCharacterSubComponent
import com.ko.rickmorty.di.cartooncharacterdetail.CartoonCharacterDetailSubcomponent
import com.ko.rickmorty.di.competition.CompetitionSubcomponent
import com.ko.rickmorty.di.core.AppComponent
import com.ko.rickmorty.di.core.AppModule
import com.ko.rickmorty.di.core.DaggerAppComponent
import com.ko.rickmorty.di.core.NetModule

class App : Application(), Injector {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule("BASE_URL"))
            .build()
    }

    override fun createCartoonCharacterSubcomponent(): CartoonCharacterSubComponent {
        return appComponent.cartoonCharacterSubcomponent().create()
    }

    override fun createCartoonCharacterDetailSubcomponent(): CartoonCharacterDetailSubcomponent {
        return appComponent.cartoonCharacterDetailSubcomponent().create()
    }

    override fun createCompetitionSubcomponent(): CompetitionSubcomponent {
        return appComponent.competitionSubcomponent().create()
    }
}