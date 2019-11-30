const Home = {
  text: 'Inicio',
  link: '/home',
  icon: 'icon-home'
};

const Maintenance = {
  text: 'Mantenimiento',
  link: '/maintenance',
  icon: 'icon-pencil',
  submenu: [
    {text: 'Alquiler', link: '/maintenance/rent'},
    {text: 'Clientes', link: '/maintenance/customer'},
    {text: 'Oficinas', link: '/maintenance/office'},
  ]
};

const Configuration = {
  text: 'Configuracion',
  link: '/configuration',
  icon: 'fas fa-cogs',
  submenu: [
    {text: 'Modelo de Datos', link: '/configuration/data_model'},
    {text: 'Dispositivos', link: '/configuration/devices'}
  ]
};

export const menu = [
  Home,
  Maintenance,
  Configuration
];
