package com.example.barcodeapp.domain.repositories

import com.example.barcodeapp.data.dao.ProductDAO
import com.example.barcodeapp.domain.models.Product
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(
    private val  productDAO: ProductDAO
) : ProductRepository {
    override suspend fun getAllProducts(): Flow<List<Product>> {
        return  productDAO.getAllProducts()
    }
}