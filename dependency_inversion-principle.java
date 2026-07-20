class application{
    private final persistence p;
    application(persistence p){
        this.p = p;
    }
    public void saveData(String data){
        p.save(data);
    }
}

public abstract persistence{
    public void save();
}

class sqlDb implements persistence{
    @Override
    public void save(string data) {
        System.out.println(data+"saveed to SQL DB");
    }
}
class mongoDb implements persistence{
    @Override
    public void save(string data) {
        System.out.println(data+"saved to MongoDB");
    }
}
class dependency_inversion_principle{
    public static void main(String[] args){
        persistence sql = new sqlDb;
        persistence mongo = new mongoDb;
        application app = new application(sql);
        app.saveData("Hello");

        application app2 = new application(mongo);
        app2.saveData("World");
    }
}
