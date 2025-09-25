public class AdapterApi implements IAdapter {
    private WebApi webApi;

    public AdapterApi(WebApi webApi) {
        this.webApi = webApi;
    }

    public WebApi getWebApi() {
        return webApi;
    }

    public void setWebApi(WebApi webApi) {
        this.webApi = webApi;
    }

    @Override
    public String operacion(Prod prod) {
        return webApi.Operacion(prod);
    }
    
}
