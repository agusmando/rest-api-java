package com.itcsoluciones.pruebaapirest.controllers;

import com.itcsoluciones.pruebaapirest.entities.Base;
import com.itcsoluciones.pruebaapirest.services.BaseServiceImpl;

public abstract class BaseControllerImpl<E extends Base, S extends BaseServiceImpl<E, Long>> implements BaseController<E, Long>{

}
