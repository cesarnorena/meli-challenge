package com.cesarnorena.meli.app.presentation

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.test.espresso.idling.CountingIdlingResource

interface Event

interface State

abstract class StatefulViewModel<S : State, E : Event> : ViewModel() {
    abstract val state: MutableLiveData<S>
    abstract fun event(event: E)
}

abstract class StatefulActivity<S : State, VM : StatefulViewModel<S, out Event>> :
    AppCompatActivity() {
    protected abstract val viewModel: VM
    protected abstract fun bindState(state: S)
    val idleResource by lazy { CountingIdlingResource("StatefulActivity") }
}
