
                  import { defineConfig } from 'vite'
                  import react from '@vitejs/plugin-react'
                  import path from 'path'
                  
                  export default defineConfig({
                    plugins: [
                      react({
                        babel: {
                          plugins: [['@babel/plugin-proposal-decorators', { legacy: true }]],
                        },
                      }),
                    ],
                    base: '/',
                    server: {
                      host: '0.0.0.0',
                      port: 5600,
                    },
                    resolve: {
                      alias: {
                        '@': path.resolve(__dirname, 'src'),
                      },
                    },
                    css: {
                      preprocessorOptions: {
                        
                      },
                    },
                  })
                  