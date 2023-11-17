package com.example.ciceroneexample

import dagger.Component

@Component(
    dependencies = [IAppDependencies::class],
    modules = [AppModule::class]
)
interface IAppComponent {

    fun inject(activity: BaseActivity)
    fun inject(activity: MainActivity)
    fun inject(fragment: MainMenuFragment)

    companion object {

        private var mComponent: IAppComponent? = null

        fun init(dependencies: IAppDependencies) {
            mComponent = DaggerIAppComponent.builder()
                .iAppDependencies(dependencies)
                .build()
        }

        fun get() = mComponent ?: throw IllegalStateException()
    }

}