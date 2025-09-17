public final class Engine {
    private final String modelName;

    public Engine(String modelName) {
        if (modelName == null || modelName.isBlank()) {
            throw new IllegalArgumentException("Engine model name cannot be empty");
        }
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    @Override
    public String toString() {
        return "Engine{" + modelName + '}';
    }
}
