public interface Subject {
    public void registerObserver(Observers observer);

    public void removeObserver(Observers observers);

    public void notifyObserver();
}
