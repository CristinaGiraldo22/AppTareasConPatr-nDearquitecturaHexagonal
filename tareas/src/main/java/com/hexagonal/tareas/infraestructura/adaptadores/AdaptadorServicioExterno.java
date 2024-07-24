package com.hexagonal.tareas.infraestructura.adaptadores;

import com.hexagonal.tareas.dominio.modelos.InformacionTareasAdicionales;
import com.hexagonal.tareas.dominio.puertos.salida.PuertoServicioExterno;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class AdaptadorServicioExterno implements PuertoServicioExterno {
    //https://jsonplaceholder.typicode.com/todos/
    //https://jsonplaceholder.typicode.com/users/


    private final RestTemplate restTemplate;
    public AdaptadorServicioExterno() {
        restTemplate = new RestTemplate();
    }
    @Override
    public InformacionTareasAdicionales obtenerInformacionTareasAdicionales(Long tareasId) {
        String apiUrl = "https://jsonplaceholder.typicode.com/todos/" + tareasId;
        ResponseEntity<JsonPlaceholderTodo>response = restTemplate.getForEntity(apiUrl, JsonPlaceholderTodo.class);
        JsonPlaceholderTodo jsonPlaceholderTodo = response.getBody();
        if(jsonPlaceholderTodo == null){
            return null;
        }

        apiUrl = "https://jsonplaceholder.typicode.com/users/" + jsonPlaceholderTodo.getUserId();
        ResponseEntity<JsonPlaceholderUser> responseUser = restTemplate.getForEntity(apiUrl, JsonPlaceholderUser.class);
        JsonPlaceholderUser jsonPlaceholderUser = responseUser.getBody();

        if(jsonPlaceholderUser == null){
            return null;
        }
        return new InformacionTareasAdicionales(jsonPlaceholderUser.getId(), jsonPlaceholderUser.getName(), jsonPlaceholderUser.getEmail());

    }

private static class JsonPlaceholderTodo{
        private Long id;
        private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}

private static class JsonPlaceholderUser{
        private Long id;
        private String name;
        private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
}
