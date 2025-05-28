<template>
  <v-app>
    <v-main>
      <v-container class="fill-height d-flex flex-column align-center justify-center">
        <v-card elevation="2" class="pa-6 text-center">
          <v-card-text>Bem-vindo ao MarketHub</v-card-text>
        </v-card>
      </v-container>
    </v-main>
  </v-app>
</template>

<script setup>
import { onMounted } from 'vue'

onMounted(async () => {
  const res = await fetch('/api/markets')
  const data = await res.json()
  console.log('Dados da API:', data)
})

</script>

<style scoped>
html, body, #app {
  height: 100%;
  margin: 0;
}
</style>
