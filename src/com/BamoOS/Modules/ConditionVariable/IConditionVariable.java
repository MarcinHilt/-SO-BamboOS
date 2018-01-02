package com.BamoOS.Modules.ConditionVariable;

import java.util.LinkedList;

public interface IConditionVariable {
    public void await(); // zmienia stan aktualnie aktywnego procesu na WAITING i wrzuca do kolejki
    public void signal(); // zmienia stan pierwszego procesu w kolejce na READY i usuwa z niej
    public void signalAll(); // j.w. dla wszystkich w kolejce
    public boolean getBusy(); // getter tajemniczej zmiennej boolowskiej
    public LinkedList<PCB> getWaiting(); // getter listy oczekujących procesów
}